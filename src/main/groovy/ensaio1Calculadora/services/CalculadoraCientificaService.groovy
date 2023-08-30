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
        return 0
    }

    @Override
    double div (double x, double y){
        return 0
    }

    @Override
    double mult(double x, double y){
        return 0
    }


}
