/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package id.co.indocyber.fresh;

/**
 *
 * @author user
 */
public class Person {
    
    private String kode;
    private String nama;
    private String gender;
    private Boolean status;
    private Integer age;
    private Double salary;
    private String address;
    
    

    public Person() {
    }

    public Person(String kode, String nama, String gender, Boolean status, Integer age, Double salary, String address) {
        this.kode = kode;
        this.nama = nama;
        this.gender = gender;
        this.status = status;
        this.age = age;
        this.salary = salary;
        this.address = address;
    } 


    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

    /**
     * @return the salary
     */
    public Double getSalary() {
        return salary;
    }

    /**
     * @param salary the salary to set
     */
    public void setSalary(Double salary) {
        this.salary = salary;
    }

    /**
     * @return the address
     */
    public String getAddress() {
        return address;
    }

    /**
     * @param address the address to set
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * @return the kode
     */
    public String getKode() {
        return kode;
    }

    /**
     * @param kode the kode to set
     */
    public void setKode(String kode) {
        this.kode = kode;
    }

    

    
   
    
    
}
