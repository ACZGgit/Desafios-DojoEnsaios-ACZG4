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
        def angleInRadians = Math.toRadians(x)
        return Math.sin(angleInRadians)
    }

    double cosseno(double x) {
        def angleInRadians = Math.toRadians(x)
        return Math.cos(angleInRadians)
    }

    double tangente(double x) {
        def angleInRadians = Math.toRadians(x)
        return Math.tan(angleInRadians)
    }

    double secante(double x) {
        double angleInRadians = Math.toRadians(x)
        double angleInRadians = 1 / Math.cos(x)

        return  cosseno(secante)
    }
}
