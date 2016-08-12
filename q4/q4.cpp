#include <stdio.h>
#include <math.h>

int main(void) {
	int n;
	scanf("%d", &n);
	
	for(int i=0; i<n; i++) {
		double x, y;
		scanf("%lf %lf", &x, &y);

		x = x + 0.00001;
		
		double m1, c1, m2, c2;
		
		m1 = (2*y*x + sqrt(4*pow(y,2)*pow(x,2) - 4*(pow(x,2)-1)*(pow(y,2)-1)))/(2*(pow(x,2)-1));
    	c1 = y - m1*x;
    	m2 = (2*y*x - sqrt(4*pow(y,2)*pow(x,2) - 4*(pow(x,2)-1)*(pow(y,2)-1)))/(2*(pow(x,2)-1));
    	c2 = y - m2*x;
    	//printf("%f %f %f %f", m1, c1, m2, c2);
		printf("(%.9f,1,%.9f,%.9f,1,%.9f)", -1*m1, c1, -1*m2, c2);
		if (i != n-1) printf("\n");
	}

	return 0;
}
