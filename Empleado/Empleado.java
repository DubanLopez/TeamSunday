package Empleado;

public class Empleado {
    private String nameEmpleado;
    private String correoEmpleado;
    private String empresaEmpelado;
    private String rolEmpleado;

    public Empleado(String nameEmpleado, String correoEmpleado, String empresaEmpelado, String rolEmpleado) {
        this.nameEmpleado = nameEmpleado;
        this.correoEmpleado = correoEmpleado;
        this.empresaEmpelado = empresaEmpelado;
        this.rolEmpleado = rolEmpleado;
    }

    public String getNameEmpleado() {
        return nameEmpleado;
    }

    public void setNameEmpleado(String nameEmpleado) {
        this.nameEmpleado = nameEmpleado;
    }

    public String getCorreoEmpleado() {
        return correoEmpleado;
    }

    public void setCorreoEmpleado(String correoEmpleado) {
        this.correoEmpleado = correoEmpleado;
    }

    public String getEmpresaEmpelado() {
        return empresaEmpelado;
    }

    public void setEmpresaEmpelado(String empresaEmpelado) {
        this.empresaEmpelado = empresaEmpelado;
    }

    public String getRolEmpleado() {
        return rolEmpleado;
    }

    public void setRolEmpleado(String rolEmpleado) {
        this.rolEmpleado = rolEmpleado;
    }
}