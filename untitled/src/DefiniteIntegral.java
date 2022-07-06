public class DefiniteIntegral {
    int independiente;
    int tsimple;
    int tcuadrado;

    public DefiniteIntegral(int independiente, int tsimple, int tcuadrado){
        this.independiente = independiente;
        this.tsimple = tsimple;
        this.tcuadrado = tcuadrado;
    }

    /**
     * Integral definida cuando el limite es 0 y rangHoras para funciones cuadraticas.
     * @ author MENESES.
     */
    public int integrarPart(int rangHoras){
        int res;
        res = independiente * rangHoras + tsimple *rangHoras*rangHoras/2 + tcuadrado * rangHoras * rangHoras * rangHoras/3;

        return res;
    }

    /**
     * Integral definida cuando el limite es ranInf y rangSup para funciones cuadraticas.
     * @ author MENESES.
     */
    public int integrarCuadr(int ranInf, int ranSup){
        int res;
        res =  integrarPart(ranSup) - integrarPart(ranInf) ;
        return res;
    }
}
