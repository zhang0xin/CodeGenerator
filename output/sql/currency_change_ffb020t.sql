
update ffb020t 
set 
fseller_delay_fee_unit = 
decode(substr(fseller_delay_fe, instr(fseller_delay_fe, ' ')+1), 'ay', '澳元', 'my', '美元', 'oy', '欧元', 'rmb', '人民币', 'ry', '日元'),
fseller_delay_fee =
to_number(rtrim(substr(fseller_delay_fe, 0, decode(instr(fseller_delay_fe, ' '), 0, 100, instr(fseller_delay_fe, ' ')))))
;

update ffb020t 
set 
fport_load_delay_fee_unit = 
decode(substr(fport_load_delay_fe, instr(fport_load_delay_fe, ' ')+1), 'ay', '澳元', 'my', '美元', 'oy', '欧元', 'rmb', '人民币', 'ry', '日元'),
fport_load_delay_fee =
to_number(rtrim(substr(fport_load_delay_fe, 0, decode(instr(fport_load_delay_fe, ' '), 0, 100, instr(fport_load_delay_fe, ' ')))))
;

update ffb020t 
set 
fsea_first_single_fee_unit = 
decode(substr(fsea_first_single_fe, instr(fsea_first_single_fe, ' ')+1), 'ay', '澳元', 'my', '美元', 'oy', '欧元', 'rmb', '人民币', 'ry', '日元'),
fsea_first_single_fee =
to_number(rtrim(substr(fsea_first_single_fe, 0, decode(instr(fsea_first_single_fe, ' '), 0, 100, instr(fsea_first_single_fe, ' ')))))
;

update ffb020t 
set 
fsea_last_single_fee_unit = 
decode(substr(fsea_last_single_fe, instr(fsea_last_single_fe, ' ')+1), 'ay', '澳元', 'my', '美元', 'oy', '欧元', 'rmb', '人民币', 'ry', '日元'),
fsea_last_single_fee =
to_number(rtrim(substr(fsea_last_single_fe, 0, decode(instr(fsea_last_single_fe, ' '), 0, 100, instr(fsea_last_single_fe, ' ')))))
;

update ffb020t 
set 
foil_adjust_single_fee_unit = 
decode(substr(foil_adjust_single_fe, instr(foil_adjust_single_fe, ' ')+1), 'ay', '澳元', 'my', '美元', 'oy', '欧元', 'rmb', '人民币', 'ry', '日元'),
foil_adjust_single_fee =
to_number(rtrim(substr(foil_adjust_single_fe, 0, decode(instr(foil_adjust_single_fe, ' '), 0, 100, instr(foil_adjust_single_fe, ' ')))))
;

update ffb020t 
set 
fbase_fee_unit = 
decode(substr(fbase_fe, instr(fbase_fe, ' ')+1), 'ay', '澳元', 'my', '美元', 'oy', '欧元', 'rmb', '人民币', 'ry', '日元'),
fbase_fee =
to_number(rtrim(substr(fbase_fe, 0, decode(instr(fbase_fe, ' '), 0, 100, instr(fbase_fe, ' ')))))
;

update ffb020t 
set 
fport_adjust_unit = 
decode(substr(fport_adjus, instr(fport_adjus, ' ')+1), 'ay', '澳元', 'my', '美元', 'oy', '欧元', 'rmb', '人民币', 'ry', '日元'),
fport_adjust =
to_number(rtrim(substr(fport_adjus, 0, decode(instr(fport_adjus, ' '), 0, 100, instr(fport_adjus, ' ')))))
;

update ffb020t 
set 
foil_adjust_fee_unit = 
decode(substr(foil_adjust_fe, instr(foil_adjust_fe, ' ')+1), 'ay', '澳元', 'my', '美元', 'oy', '欧元', 'rmb', '人民币', 'ry', '日元'),
foil_adjust_fee =
to_number(rtrim(substr(foil_adjust_fe, 0, decode(instr(foil_adjust_fe, ' '), 0, 100, instr(foil_adjust_fe, ' ')))))
;

update ffb020t 
set 
ftransport_fee_unit = 
decode(substr(ftransport_fe, instr(ftransport_fe, ' ')+1), 'ay', '澳元', 'my', '美元', 'oy', '欧元', 'rmb', '人民币', 'ry', '日元'),
ftransport_fee =
to_number(rtrim(substr(ftransport_fe, 0, decode(instr(ftransport_fe, ' '), 0, 100, instr(ftransport_fe, ' ')))))
;

update ffb020t 
set 
ftransport_first_fee_unit = 
decode(substr(ftransport_first_fe, instr(ftransport_first_fe, ' ')+1), 'ay', '澳元', 'my', '美元', 'oy', '欧元', 'rmb', '人民币', 'ry', '日元'),
ftransport_first_fee =
to_number(rtrim(substr(ftransport_first_fe, 0, decode(instr(ftransport_first_fe, ' '), 0, 100, instr(ftransport_first_fe, ' ')))))
;

update ffb020t 
set 
ftransport_last_fee_unit = 
decode(substr(ftransport_last_fe, instr(ftransport_last_fe, ' ')+1), 'ay', '澳元', 'my', '美元', 'oy', '欧元', 'rmb', '人民币', 'ry', '日元'),
ftransport_last_fee =
to_number(rtrim(substr(ftransport_last_fe, 0, decode(instr(ftransport_last_fe, ' '), 0, 100, instr(ftransport_last_fe, ' ')))))
;



select f0 , fseller_delay_fe, fseller_delay_fee, fseller_delay_fee_unit, fport_load_delay_fe, fport_load_delay_fee, fport_load_delay_fee_unit, fsea_first_single_fe, fsea_first_single_fee, fsea_first_single_fee_unit, fsea_last_single_fe, fsea_last_single_fee, fsea_last_single_fee_unit, foil_adjust_single_fe, foil_adjust_single_fee, foil_adjust_single_fee_unit, fbase_fe, fbase_fee, fbase_fee_unit, fport_adjus, fport_adjust, fport_adjust_unit, foil_adjust_fe, foil_adjust_fee, foil_adjust_fee_unit, ftransport_fe, ftransport_fee, ftransport_fee_unit, ftransport_first_fe, ftransport_first_fee, ftransport_first_fee_unit, ftransport_last_fe, ftransport_last_fee, ftransport_last_fee_unit from ffb020t 