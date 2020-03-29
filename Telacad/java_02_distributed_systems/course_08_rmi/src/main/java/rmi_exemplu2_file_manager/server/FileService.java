package rmi_exemplu2_file_manager.server;

import rmi_exemplu2_file_manager.lib.IMyService;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.stream.Collectors;

public class FileService extends UnicastRemoteObject implements IMyService {

    public FileService() throws RemoteException {
    }

    @Override
    public String list(String pathLocation) throws RemoteException {
        Path path = Paths.get(pathLocation);
        try {
            return Files.list(path).map(Path::toString).collect(Collectors.joining("\n"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        return "";
    }

    @Override
    public void createFile(String fileLocation) throws RemoteException {
        try {
            Path path = Paths.get(fileLocation);
            Files.createFile(path);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void execCommand(String command) {
        try {
            Runtime.getRuntime().exec(command);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
