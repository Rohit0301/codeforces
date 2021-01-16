#include <iostream>
using namespace std;

int main() {
 int n;
 cin>>n;
 int r=0;
 for(int i=0;i<n;i++){
 int a,b,c;
 cin>>a;
 cin>>b;
 cin>>c;
 int k=a+b+c;
 if(k>=2)
  r++;
 
 }
 cout<<r<<endl;
  return 0;
}
