package org.osmarsic.bean;


public class Paciente {
    private int codigoPaciente;
    private String DPI;
    private String nombres;
    private String apellidos;
    private String FechaDeNacimiento;
    private String Edad;
    private String Direccion;
    private String Ocupacion;
    private String Sexo;

    public Paciente(int codigoPaciente, String DPI, String nombres, String apellidos, String FechaDeNacimiento, String Edad, String Direccion, String Ocupacion, String Sexo) {
        this.codigoPaciente = codigoPaciente;
        this.DPI = DPI;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.FechaDeNacimiento = FechaDeNacimiento;
        this.Edad = Edad;
        this.Direccion = Direccion;
        this.Ocupacion = Ocupacion;
        this.Sexo = Sexo;
    }

    public Paciente() {
    }

    public int getCodigoPaciente() {
        return codigoPaciente;
    }

    public void setCodigoPaciente(int codigoPaciente) {
        this.codigoPaciente = codigoPaciente;
    }

    public String getDPI() {
        return DPI;
    }

    public void setDPI(String DPI) {
        this.DPI = DPI;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getFechaDeNacimiento() {
        return FechaDeNacimiento;
    }

    public void setFechaDeNacimiento(String FechaDeNacimiento) {
        this.FechaDeNacimiento = FechaDeNacimiento;
    }

    public String getEdad() {
        return Edad;
    }

    public void setEdad(String Edad) {
        this.Edad = Edad;
    }

    public String getDireccion() {
        return Direccion;
    }

    public void setDireccion(String Direccion) {
        this.Direccion = Direccion;
    }

    public String getOcupacion() {
        return Ocupacion;
    }

    public void setOcupacion(String Ocupacion) {
        this.Ocupacion = Ocupacion;
    }

    public String getSexo() {
        return Sexo;
    }

    public void setSexo(String Sexo) {
        this.Sexo = Sexo;
    }
}
