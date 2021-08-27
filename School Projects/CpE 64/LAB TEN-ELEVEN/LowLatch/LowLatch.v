module LowLatch(q, NOTq, s, r, q, NOTq);
output q, NOTq;
input s, r;

nand U2(q, NOTq, s);
nand U6(NOTq, q, r);

endmodule

