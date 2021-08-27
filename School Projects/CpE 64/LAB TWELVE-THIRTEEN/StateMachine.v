module StateMachine  (clk, reset, X, W, Y, Q);
    input wire reset, clk,  X;
    output reg Y,  W;          //Y = mealy output, W = moore output

    output reg [2:0] Q;      //   (next state)
    reg [2:0] D;    	 //states
	 
always @ (posedge clk)
if (reset == 0)     //  if Reset = 0; go to state 4  (D = 'b100 )
    D = 3'b100;
else
begin
 case (D)
0:    begin
        W =0;
            if (X) begin Q = 2; Y = 0; end
           else if(~X) begin Q = 1; Y = 1;  end
        end

1:     begin
			W =0;
				 if (X) begin Q = 2; Y = 1; end
				else if(~X) begin Q = 3; Y = 1; end
		  end
2:
		begin
			W = 1;
				 if (X) begin Q = 7; Y = 1; end
				else if(~X) begin Q = 0; Y = 1; end
		  end
3:
		begin
			W = 1;
				 if (X) begin Q = 7; Y = 1; end
				else if(~X) begin Q = 0; Y = 1; end
		  end
//4:
//		begin
//			reset = 0;
//			end
//5:
//		begin
//			reset = 0;
//			end
//6:
//		begin
//			reset = 0;
//			end
7:
		begin
			W = 0;
				 if (X) begin Q = 1; Y = 0; end
				else if(~X) begin Q = 2; Y =0; end
			end
endcase
end
endmodule
