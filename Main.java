public class Main {
    public static void main(String[] args) {

        Notificacao notif = new Notificacao();

        notif.enviar();
        notif.enviar("Promoção disponível!");
        notif.enviar("Olá!", "usuario@email.com");
        notif.enviar("Alerta urgente", "99999-9999", 5);

        System.out.println();


        NotificacaoEmail email = new NotificacaoEmail();
        email.setDestinatario("maria@email.com");
        email.enviar();

        NotificacaoSMS sms = new NotificacaoSMS();
        sms.setDestinatario("99999-9999");
        sms.enviar();

        NotificacaoPush push = new NotificacaoPush();
        push.setDestinatario("João");
        push.enviar();
    }
}