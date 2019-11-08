package view;

import dao.GenericJPA_DAO;
import model.Administrador;
import model.Atendente;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AtendenteCRUD {
        public void cadastrarAtendente () {
            Atendente atendente = new Atendente(0, "ate", "123", "email@teste", "senha");
            GenericJPA_DAO<Atendente> genericDAO = new GenericJPA_DAO<Atendente>(null);

            genericDAO.persist(atendente);

        }

}
