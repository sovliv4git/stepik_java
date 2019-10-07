package com.sovliv;


import java.util.logging.ConsoleHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.XMLFormatter;

public class LogManager {

    public static void main(String[] args) {
        configureLogger();
    }

    private static void configureLogger() {

        Logger logger = Logger.getLogger("org.stepik.java");
        logger.setLevel(Level.ALL);

        /**
         * ConsoleHandler - обработчик сообщения, определяет куда будет записано сообщение.
         * В данном случае в консоль.
         */
        ConsoleHandler consoleHandler = new ConsoleHandler();

        /**
         * XMLFormatter - определят в каком формате будут выводиться сообщения в лог.
         */
        XMLFormatter xmlFormatter = new XMLFormatter();

        /**
         * Хендлеру задается уровень логирования и форматтер.
         */
        consoleHandler.setLevel(Level.ALL);
        consoleHandler.setFormatter(xmlFormatter);

        /**
         * Логгеру добавляется хендлер.
         */
        logger.addHandler(consoleHandler);

        /**
         * setUseParentHandlers(false) отключает обычные обработчики,
         * чтобы не выполнялось ненужное ведение журнала.
         */
        logger.setUseParentHandlers(false);

        Logger logger1 = Logger.getLogger("org.stepik.java.logger.ClassA");
        logger1.setLevel(Level.ALL);

        Logger logger2 = Logger.getLogger("org.stepik.java.logger.ClassB");
        logger2.setLevel(Level.WARNING);
    }
}
