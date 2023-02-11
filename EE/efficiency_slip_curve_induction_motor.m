% M-file create a plot of efficiency-slip of given  
% induction motor

% First, initialize the values needed in this program.
clc
clear all
r1 = 0.103;                 % Stator resistance
x1 = 1.10i;                 % Stator reactance
r2 = 0.225;                 % Rotor resistance
x2 = 1.13i;                 % Rotor reactance
xm = 59.4i;                  % Magnetization branch reactance
v_phase = 460 / sqrt(3);    % Phase voltage
n_sync = 1800;              % Synchronous speed (r/min)
w_sync = 188.5;             % Synchronous speed (rad/s)
s = (0:1:500) / 500;           % Slip
s(1) = 0.001;
nm = (1 - s) * n_sync;       % Mechanical speed
for ii = 1:501
z_s(ii) = r1+(x1);          %stator empedance
z_r(ii) = (r2/s(ii))+(x2);  %rotor empedance
z_m(ii) = xm ;              %magnetization empedance
z_eq(ii) = z_s(ii)+((z_m(ii)*z_r(ii))/(z_m(ii)+z_r(ii))); %eq. empedance
i_s(ii) = v_phase/z_eq(ii) ;    %stator current
p_in(ii) = 3*v_phase*(real(i_s(ii)));   %input power
e_s(ii) = v_phase-(i_s(ii)*z_s(ii));    
i_r(ii) = e_s(ii)/z_r(ii);              %rotor current
p_conv(ii) = 3*(((abs(i_r(ii)))^2)*((r2)*((1-s(ii))/(s(ii))))); 
p_out(ii) = ((p_conv(ii)))-18-220;      %output power
eff(ii) = (p_out(ii))/(p_in(ii));     %efficiency

end




% Plot the Efficiency-Slip curve
plot(s,eff,'Color','k','LineWidth',2.0);
hold on;
xlabel('slip','Fontweight','Bold');
ylabel('efficieny','Fontweight','Bold');
title ('Induction Motor Efficiency - Slip Graph','Fontweight','Bold');
grid on;
hold off;
