package com.test.mor;

public class SingleQ extends Question{
	String [] answer;
	public SingleQ() {}
	public SingleQ(int id,String text,String[] ops,String[] answer) {
		this.id = id;
		this.text = text;
		this.options = ops;
		this.answer = answer;
	}
		@SuppressWarnings({ "unlikely-arg-type", "unused" })
		public boolean checkAnswer(String[] ans) {
			for(String str :ans) {
			if(ans == null ||ans.length != 1)
			{
				return false;
			}else
			{
				return this.answer.equals(ans[0]);
			}
			}
			return false;
			}
}
