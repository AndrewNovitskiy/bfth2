package com.andrew.controller;

import com.andrew.action.Action;
import com.andrew.command.Command;
import com.andrew.holder.CommandHolder;
import org.apache.log4j.Logger;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


public class Controller extends HttpServlet {

    private static final Logger LOG = Logger.getLogger(Controller.class);

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException {
        process(request, response);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException {
        process(request, response);
    }

    private void process(HttpServletRequest request, HttpServletResponse response) throws ServletException {

        String commandName = request.getParameter("command");
        Command command = CommandHolder.get(commandName);

        try {
            Action action = command.execute(request, response);
            action.go(request, response);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }




}