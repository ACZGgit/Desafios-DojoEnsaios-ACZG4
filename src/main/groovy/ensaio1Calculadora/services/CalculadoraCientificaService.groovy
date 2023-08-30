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
        x * y
    }

    static double raizQuadrada(double x){
        return Math.sqrt(x)
    }

    static double pot(double x, double y){
        return Math.pow(x, y)
    }
}
