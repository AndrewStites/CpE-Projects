module labcircuit(f,a,b,c,d);
output f;
input a,b,c,d;
wire and_u2a_wire,and_u6a_wire,and_u7a_wire;

and u2a(and_u2a_wire,a,b);
and u6a(and_u6a_wire,c,d);
and u7a(and_u7a_wire,b,c);

or u9a(f,and_u2a_wire,and_u6a_wire,and_u7a_wire);

endmodule //labcircuit