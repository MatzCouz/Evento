package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import Entidades.Convidado;

public class ConvidadoDAO {
	public boolean cadastrarConvidado(Convidado user) throws SQLException, ClassNotFoundException{
		String verifica = "SELECT cpf FROM convidado WHERE cpf='"+user.getCPF()+"'";
		boolean x = false;
		try{
		ConnectionFactory.openConnection();
		Connection con = ConnectionFactory.getConnection();
		Statement stm = con.createStatement();
		ResultSet rs = stm.executeQuery(verifica);
		while(rs.next()){
			x = true;
		}
		}catch(SQLException e){
			e.printStackTrace();
		}
		if(x==false){
		String sql = "INSERT INTO convidado(nome, end, CPF, identidade, perfil) VALUES(?,?,?,?,?)";

		try{
			ConnectionFactory.openConnection();
			Connection con = ConnectionFactory.getConnection();
			Statement stm = con.createStatement();
			PreparedStatement prepara = con.prepareStatement(sql);
			prepara.setString(1, user.getNome());
			prepara.setString(2, user.getEnd());
			prepara.setInt(3, user.getCPF());
			prepara.setInt(4, user.getIdentidade());
			prepara.setString(5, user.getPerfil());
			prepara.execute();
			prepara.close();
		}catch(SQLException e){
			e.printStackTrace();
		}catch(ClassNotFoundException e){
			e.printStackTrace();
		}
		verifica = "SELECT cod FROM convidado WHERE cpf='"+user.getCPF()+"'";
		try{
		ConnectionFactory.openConnection();
		Connection con = ConnectionFactory.getConnection();
		Statement stm = con.createStatement();
		ResultSet rs = stm.executeQuery(verifica);
		while(rs.next()){
			user.setCod(rs.getInt("cod"));
		}
		}catch(SQLException e){
			e.getMessage();
		}
		}
		return x;
	}
	public boolean verificarAcesso(int codigoBuscar) throws ClassNotFoundException{
		String sql = "SELECT * FROM convidado where cod='"+codigoBuscar+"'";
		boolean x = false;
		try{
			ConnectionFactory.openConnection();
			Connection con = ConnectionFactory.getConnection();
			PreparedStatement ps = con.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			while(rs.next()){
				x = true;
			}
		}catch(SQLException e){
			e.getMessage();
		}
		
		return x;
	}
	
	public static List<Convidado> listarConvidados(String nomeBuscar, boolean x) throws ClassNotFoundException{
		String sql = "SELECT * FROM convidado WHERE nome='"+nomeBuscar+"'";
		List<Convidado> convidado = new ArrayList<Convidado>();
		try{
			ConnectionFactory.openConnection();
			Connection con = ConnectionFactory.getConnection();
			PreparedStatement ps = con.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			while(rs.next()){
				x = true;
				Convidado conv = new Convidado();
				conv.setNome(rs.getString("nome"));
				conv.setCod(rs.getInt("cod"));
				conv.setPerfil(rs.getString("perfil"));
				convidado.add(conv);
			}
		}catch(SQLException e){
			System.out.println(e);
		}
		return convidado;
	}
}
