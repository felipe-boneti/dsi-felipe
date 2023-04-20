/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

public class Usuario {
    Long id;
    String nome;
    String cpf;
    String email;
    String telefone;
    String Cidade;
    String Sexo;
    String DataDeNascimento;
    String EstadoCivil;
    String Profissao;
    
    public String getCpf() {
        return cpf;
    }
    public void setCpf(String cpf){
        this.cpf = cpf;
    }
    public String getEmail(){
        return email;
    }
    public void setEmail(String email){
        this.email = email;
    }
    public Long getId(){
        return id;
    }
    public String getNome(){
        return nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    public String getTelefone(){
        return telefone;
    }
    public void setTelefone(String telefone){
        this.telefone = telefone;
    }
    public String getCidade(){
        return Cidade;
    }
    public void setCidade(String Cidade){
        this.Cidade = Cidade;
    }
    public String getSexo(){
        return Sexo ;
    }
    public void setSexo(String Sexo){
        this.Sexo = Sexo;
    }
    public String getDataDeNascimento(){
        return DataDeNascimento;
    }
    public void setDataDeNascimento(String DataDeNascimento){
        this.DataDeNascimento = DataDeNascimento;
    }
    public String getEstadoCivil(){
        return EstadoCivil;
    }
    public void setEstadoCivil(String EstadoCivil){
        this.EstadoCivil = EstadoCivil;
    }
    public String getProfissao(){
        return Profissao;
    }
    public void setProfissao(String Profissao){
        this.Profissao = Profissao;
    }
}

