package ensaio1Calculadora.services

import ensaio1Calculadora.interfaces.ICalculadora


class CalculadoraCientificaService implements ICalculadora{

    private double lastResult;


    double getLastResult(){
        return this.lastResult
    }

    void setLastResult(double lastResult){
        this.lastResult = lastResult
    }

    @Override
    public double sum(double x, double y){
        return x + y
    }

    @Override
    double sub(double x, double y) {
        return x - y
    }

    @Override
    double div (double x, double y){
        return x / y
    }

    @Override
    double mult(double x, double y){
        return x * y
    }

    double raizQuadrada(double x){
        return Math.sqrt(x)
    }

    double pot(double x, double y){
        return Math.pow(x, y)
    }

    double porcentagem(double x, double y){
        return x * (y / 100)
    }

    double log(double x, double y) {
        return Math.log(y) / Math.log(x)
    }

    double seno(double x) {
        double angleInRadians = Math.toRadians(x)
        return Math.sin(angleInRadians)
    }

    double cosseno(double x) {
        double angleInRadians = Math.toRadians(x)
        return Math.cos(angleInRadians)
    }

    double tangente(double x) {
        double angleInRadians = Math.toRadians(x)
        return Math.tan(angleInRadians)
    }

    double secante(double x) {
        double angleInRadians = Math.toRadians(x)
        double secante = 1 / Math.cos(angleInRadians)

        return secante
    }

    double cosecante(double x) {
        double angleInRadians = Math.toRadians(x)
        double cosecante = 1 / Math.sin(angleInRadians)

        return cosecante
    }

    double cotangente(double x) {
        return 1 / this.tangente(x)
    }

    double somaDeVariosTermos(List<Double> numbers) {
        return numbers.sum()
    }

    double raizEnessimaDeX(double num, double term){
        return Math.pow(num, 1 / term)
    }

    double fatorial(double num){
        Double resultFatorial = 1;
        for (int i = num; i > 1; i--) {
            resultFatorial = resultFatorial * i
        }

        return resultFatorial
    }

    static double mediaSimples(List<Integer> num) {
        return num.sum() / num.size()
    }

}
