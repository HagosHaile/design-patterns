package bank.service;

//Command interface
public interface ICommand {
   public void execute();
   public void unExecute();
}
