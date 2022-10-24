package MovimientoDinero;

public class MovimientoDinero{

    private float monto;
    private float crearMontoPositivo;
    private float crearMontoNegativo;


    public MovimientoDinero(float monto, float crearMontoPositivo, float crearMontoNegativo) {
        this.monto = monto;
        this.crearMontoPositivo = crearMontoPositivo;
        this.crearMontoNegativo = crearMontoNegativo;
    }

    public float getMonto() {
        return monto;
    }

    public void setMonto(float monto) {
        this.monto = monto;
    }

    public float getCrearMontoPositivo() {
        return crearMontoPositivo;
    }

    public void setCrearMontoPositivo(float crearMontoPositivo) {
        this.crearMontoPositivo = crearMontoPositivo;
    }

    public float getCrearMontoNegativo() {
        return crearMontoNegativo;
    }

    public void setCrearMontoNegativo(float crearMontoNegativo) {
        this.crearMontoNegativo = crearMontoNegativo;
    }
}