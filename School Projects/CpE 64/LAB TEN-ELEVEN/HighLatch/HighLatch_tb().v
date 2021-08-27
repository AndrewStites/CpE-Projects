module HighLatch_tb();

	reg s, r; 

	wire q, NOTq; 

	HighLatch uut (.s(s), .r(r), .q(q), .NOTq(NOTq));

initial begin

	{s, r} = 0; #10 //0000 #10=>delay
	{s, r} = 1; #10
	{s, r} = 2; #10
	{s, r} = 3; #10

$finish;

	end
	
endmodule