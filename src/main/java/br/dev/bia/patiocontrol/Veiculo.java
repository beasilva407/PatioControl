

package br.dev.bia.patiocontrol;



public class Veiculo
{

    private String placa;
    private String marca;
    private String modelo;
    private int status;
    private String motorista;

    public Veiculo(String placa, String marca, String modelo) {
        this.placa = placa;
        this.marca = marca;
        this.modelo = modelo;
        this.status = 0;
        this.motorista = "";
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getStatus() {
        return status;
    }

    public void changeStatus() {
        if (status == 0) {
            status = 1;
        } else {
            status = 0;
        }
    }

    public String getMotorista() {
        return motorista;
    }

    public void setMotorista(String motorista) {
        this.motorista = motorista;
    }

    @Override
    public String toString() {
        return String.format("%-10s %-15s %-15s %-20s %d",
                placa, modelo, marca, motorista, status);
    }
}