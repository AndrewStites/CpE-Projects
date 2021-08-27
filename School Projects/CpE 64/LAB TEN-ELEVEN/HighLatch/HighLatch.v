module HighLatch(q, NOTq, s, r, q, NOTq);
output q, NOTq;
input s, r;

nor U2(q, NOTq, r);
nor U6(NOTq, q, s);

endmodule

