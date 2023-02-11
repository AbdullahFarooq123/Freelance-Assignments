a = [1 0 0 0 0];
b = 1;
c = [1 0.5 -1.5];
d = filter(b,c,a);
a = [1 1 1 1];
d = conv (a,d,'full');
subplot(2,2,1)
stem(a)
title('Input Step Function')
xlabel('X Impulse')
ylabel('y')
subplot(2,2,2)
stem(d)
title('Input Response d when x = [ 1 1 1 1 ]')
xlabel('X Impulse')
ylabel('h')