package print;

import print.machines.PrinterMachine;
import print.machines.copy.CopyMachine;
import print.machines.scanner.ScannerMachine;

public class MultifuctionalMachine implements CopyMachine, ScannerMachine, PrinterMachine {

	@Override
	public void copying() {
		System.out.println("COPYING BY MULTIFUNCTIONAL MACHINE");	
	}

	@Override
	public void scanning() {
		System.out.println("SCANNING BY MULTIFUNCTIONAL MACHINE");	
		
	}

	@Override
	public void printing() {
		System.out.println("PRINTING BY MULTIFUNCTIONAL MACHINE");	
		
	}
	
}
