package pe.edu.vallegrande.dao;

import java.util.List;
import pe.edu.vallegande.model.Paciente;

public interface IPacienteDAO {
    // java 6, 7 y 8 por defecto los metodos son publicos
    // java 9 existen metodos privados
    void guardar(Paciente paciente) throws Exception; 
    void modificar(Paciente paciente) throws Exception; 
    void eliminar(int IdPaciente) throws Exception; 
    List<Paciente> listarTodos() throws Exception; 
    Paciente listarPorId(int IdPaciente) throws Exception; 
}