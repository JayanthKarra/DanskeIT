package com.ds.behavior.visitor;
		public class VisitorPatternDemo {
			   public static void main(String[] args) {
			      ComputerPart computer = new Computer();
			      computer.accept(new ComputerPartDisplayVisitor());
			   }
			}



