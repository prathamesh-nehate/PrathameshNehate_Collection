package com.epam.collection.CustomList;

class CustomEmployeeList{
    CustomList<Employee> list;

    public CustomEmployeeList(){
        this.list = new CustomList<Employee>();
    }

    public void addEmployee(int id , String name , String designation , double salary) {
		list.add(new Employee(id, name, designation, salary)) ;
		
    }
    
    public Employee getEmployee(int empid) {
        Employee e = new Employee();
        for(int i = 0;i<list.length();i++){
            if(list.get(i).getEmployeeId() == empid){
                e = list.get(i);
            }
        }
        return e;
    }
    
    public void removeEmployee(int empid) {
        Employee e = new Employee();
        for(int i = 0;i<list.length();i++){
            e = list.get(i);
            if(e.getEmployeeId() == empid){
                list.remove(e);
                break;
            }
        }
    }
    
    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return list.toString();
    }
}