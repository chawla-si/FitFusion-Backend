package com.fitFusion.springbootlibrary.service;

import com.fitFusion.springbootlibrary.dao.CustomerRepository;
import com.fitFusion.springbootlibrary.entity.Customer;
import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import java.io.FileReader;
import java.io.IOException;

@Service
public class CsvService {

    @Autowired
    private CustomerRepository customerRepository;

    @Transactional
    public void readAndSaveDataFromCsv(String csvFilePath) throws IOException, CsvException {
        try (CSVReader reader = new CSVReader(new FileReader(csvFilePath))) {
            reader.readAll().forEach(row -> {
                Customer customer = new Customer(row[0], row[1]);
                customerRepository.save(customer);
            });
        }
    }
}
