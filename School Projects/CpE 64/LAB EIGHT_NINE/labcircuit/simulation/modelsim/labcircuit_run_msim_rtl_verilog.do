transcript on
if {[file exists rtl_work]} {
	vdel -lib rtl_work -all
}
vlib rtl_work
vmap work rtl_work

vlog -vlog01compat -work work +incdir+C:/Users/andre/Desktop/LAB\ REPORTS/LAB\ EIGHT_NINE/labcircuit {C:/Users/andre/Desktop/LAB REPORTS/LAB EIGHT_NINE/labcircuit/labcircuit.v}

