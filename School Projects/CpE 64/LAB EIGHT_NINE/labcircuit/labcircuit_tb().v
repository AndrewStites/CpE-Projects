module labcircuit_tb();

	reg a, b, c, d; 

	wire f; 

	labcircuit uut (.a(a), .b(b), .c(c), .d(d), .f(f));

initial begin

	{a, b, c, d} = 0; #10 //0000 #10=>delay
	{a, b, c, d} = 1; #10//0001
	{a, b, c, d} = 2; #10 //0010
	{a, b, c, d} = 3; #10 
	{a, b, c, d} = 4; #10 //0000 #10=>delay
	{a, b, c, d} = 5; #10 //0001
	{a, b, c, d} = 6; #10 //0010
	{a, b, c, d} = 7; #10 
	{a, b, c, d} = 8; #10 //0000 #10=>delay
	{a, b, c, d} = 9; #10 //0001
	{a, b, c, d} = 10; #10 //0010
	{a, b, c, d} = 11; #10 
	{a, b, c, d} = 12; #10 //0000 #10=>delay
	{a, b, c, d} = 13; #10 //0001
	{a, b, c, d} = 14; #10 
	{a, b, c, d} = 15;  #10 

$finish;

	end
	
endmodule