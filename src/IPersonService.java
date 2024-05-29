public interface IPersonService {
    public Person Add(Person person);
    public void Delete(int Id);
    public Person Update(Person person, int Id);
    public Person Get(int Id);
    public Person[] GetAll(); 
}
