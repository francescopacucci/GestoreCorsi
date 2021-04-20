package it.polito.tdp.corsi.db;

import it.polito.tdp.corsi.model.Corso;

public class testDao {

	public static void main(String[] args) {
		CorsoDAO dao = new CorsoDAO();
		System.out.println(dao.getStudentibycorso(new Corso("01KSUPG", null, null, null)));
		
	}

}
