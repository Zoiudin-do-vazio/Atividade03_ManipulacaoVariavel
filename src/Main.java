import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        DecimalFormat arredondador = new DecimalFormat("R$ 0.00");
        String nomeDoProduto = "quilograma da picanha";
        double precoUnitario = 96.75;
        double quantidadeComprada = 2.5;
        double impostoSobreProduto = 0.11;
        double lucrosPrevistos = 0.50;
        double precoTotal = precoUnitario * quantidadeComprada;
        double valorComImposto = (impostoSobreProduto * precoTotal) + precoTotal;
        double valorPrecisoParaObterLucro = valorComImposto * lucrosPrevistos;
        String precoDeVendaLucrativa = arredondador.format(valorComImposto + valorPrecisoParaObterLucro);
        double precoArredondado = Math.round(valorComImposto);
        String mensagemDoDesafio = "Nome Do Produto: " + nomeDoProduto + " Valor Com Impostos: " + precoArredondado + " Preço de venda recomendada para obter lucros: " + precoDeVendaLucrativa;
        System.out.println(mensagemDoDesafio);
        System.out.println("nome " + nomeDoProduto);
        System.out.println("preço " + precoUnitario);
        System.out.println("quantidade " + quantidadeComprada);
        System.out.println("imposto em decimal " + impostoSobreProduto);
        System.out.println("lucros previstos em decimal " + lucrosPrevistos);
        System.out.println("preço total " + precoTotal);
        System.out.println("valor com impostos " + valorComImposto);
        System.out.println("valor preciso para lucros " + valorPrecisoParaObterLucro );
        System.out.println("preco de uma venda lucrativa" + precoDeVendaLucrativa);
        System.out.println("preço arredondado " + precoArredondado);
    }
}
