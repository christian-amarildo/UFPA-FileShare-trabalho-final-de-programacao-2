public enum Assinatura {
    PADRAO,  // Assinatura Padrão
    PREMIUM; // Assinatura Premium

    // Se necessário, você pode adicionar métodos extras ao enum, como obter uma descrição para cada tipo de assinatura.
    public String descricao() {
        switch (this) {
            case PADRAO:
                return "Assinatura Padrão: Acesso básico ao sistema.";
            case PREMIUM:
                return "Assinatura Premium: Acesso completo com benefícios adicionais.";
            default:
                return "Tipo de assinatura desconhecido.";
        }
    }
}
