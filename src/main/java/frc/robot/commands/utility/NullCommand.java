package.frc.robot.commands.utility.NullCommand;
import edu.wpi.first.wpilibj2.command.CommandBase;

public class NullCommand extends CommandBase{
    public NullCommand(){

    }
    
    // Called when the command is initially scheduled.
  @Override
  public void initialize() {
  }

  @Override
  public void execute() {
  }

  // Called once the command ends or is interrupted.
  @Override
  public void end(boolean interrupted) {
  }

  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
    return false;
  }


}