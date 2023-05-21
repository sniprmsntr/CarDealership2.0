package org.example;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class ContractFileManager {
    private static final String CONTRACT_FILE_PATH = "path/to/contracts/file";

    public void saveContract(Contract contract) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(CONTRACT_FILE_PATH, true))) {
            writer.append(contract.toString());
            writer.newLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
