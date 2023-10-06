package org.example;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;


import java.io.File;

public class Main {
    public static void main(String[] args) {
        try {
            readStudentJson("input.json");
        }
        catch (Exception e) {
            System.out.println(e);
        }
    }

    public static void readStudentJson(String inputFile) {
        try {
            // Reading JSON file data to a String
            File jsonFile = new File(inputFile);
            ObjectMapper objectMapper = new ObjectMapper();

            // Updated this to use objectMapper to get the StudentListDTO Class
            StudentListDTO studentListDTO = objectMapper.readValue(jsonFile, StudentListDTO.class);

            // Convert JSON string into an object
//            TypeReference<List<StudentDTO>> typeReferenceListStudentDTO = new TypeReference<>(){};
//            List<StudentDTO> studentsList = objectMapper.readValue(jsonFile, typeReferenceListStudentDTO);

            // Iterated over StudentListDTO getter and return first name.
            // You can get any property from a student getter inside this list to update the printout. Try it!
            for (StudentDTO student : studentListDTO.getStudents()) {
                System.out.println(student.getFirstname() + " " + student.getLastname());
                System.out.println(student.getCity());
                System.out.println("\n");
            }
        }
        catch (Exception e) {
            System.out.println(e);
        }
    }

    public static void createStudentJson() throws JsonProcessingException {
        StudentDTO student = new StudentDTO();
        student.setFirstname("Jim");
        student.setLastname("Johnson");
        student.setAge(34);
        student.setCity("Indianapolis");

        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.configure(SerializationFeature.INDENT_OUTPUT, true); // Pretty Print
        String studentStr = objectMapper.writeValueAsString(student);
        System.out.println(studentStr);
    }
}

/*
Why JSON?
1. It's lightweight
2. It's language-independent!
3. It's a standardized structure.

Deserialization
1. Create DTO Class
2. Identify the input String or File that we will use to pass in JSON data
3. Instantiate an ObjectMapper object and call its readValue using the DTO class

Serialization
1. Create DTO Class
2. Instantiate an ObjectMapper
3. Configure the ObjectMapper for Serialization
4. Use ObjectMapper to call writeValueAsString() to create a JSON String

 */

