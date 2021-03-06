package core;

import java.util.Arrays;
/**
 * 
 * @author wattsz
 * Command that represents the divide functionality
 */
public class StoredDivCommand extends StoredCommand{

	public StoredDivCommand(COMMAND_TYPE command, int commandResult, int[] commandArgs) {
		super(command, commandResult, commandArgs);
	}

	@Override
	public String toString() {
		return "DIV " + Arrays.toString(numberArgs) + " => " + result;
	}

}
