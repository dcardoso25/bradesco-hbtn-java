import java.util.ArrayList;

public class ProcessadorVideo {

    private ArrayList<CanalNotificacao> canais = new ArrayList<>();

    public ProcessadorVideo() {

    }

    public void registrarCanal(CanalNotificacao canal) {
        this.canais.add(canal);
    }

    public void processar(Video video) {

        for (CanalNotificacao canal : canais) {
            String message = String.format("%s - %s", video.getArquivo(), video.getFormatoVideo());

            canal.notificar(new Mensagem(message, TipoMensagem.LOG));
        }
    }

}
