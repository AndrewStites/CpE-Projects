transcript on
if {[file exists rtl_work]} {
	vdel -lib rtl_work -all
}
vlib rtl_work
vmap work rtl_work

vlog -vlog01compat -work work +incdir+C:/Users/andre/Desktop/LAB\ REPORTS/LAB\ TEN-ELEVEN/HighLatch {C:/Users/andre/Desktop/LAB REPORTS/LAB TEN-ELEVEN/HighLatch/HighLatch.v}

