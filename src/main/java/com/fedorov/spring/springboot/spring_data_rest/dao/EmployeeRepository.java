package com.fedorov.spring.springboot.spring_data_rest.dao;





import com.fedorov.spring.springboot.spring_data_rest.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;




public interface EmployeeRepository extends JpaRepository<Employee, Integer> {


    /*
    Берется первый дженерик Employee из JpaRepository<Employee, Integer>,
    превращается в employee с помощью SpringBoot - spring-boot-starter-data-rest зависимости,
    которую мы указали в POM.
    Spring без прописания своего контроллера с его мэппингами, будет использовать
    api by default в формате:

    Http-метод           URL                        CRUD-операция
    GET            employees                    Получение всех работников
    GET            employees/{employeeId}       Получение одного работника
    POST           employees                    Добавление работника
    PUT            employees                    Изменение работника
    DELETE         employees/{employeeId}       Удаление работника
     */
}
