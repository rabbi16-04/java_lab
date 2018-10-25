#include<bits/stdc++.h>
using namespace std;


/*int main () {
  string line;
  ifstream myfile ("example.txt");
  if (myfile.is_open())
  {
    while ( getline (myfile,line) )
    {
      cout << line << '\n';
    }
    myfile.close();
  }

  else cout << "Unable to open file"; 

  return 0;
}*/


int main()
{
	 char ch;
    ifstream fin;
    fin.open("example.txt",ios::in);

	if( char == 'a' || char=='e' || char== 'i' || char== 'o' || char== 'u'){
		
    ofstream fout;
    fout.open("new.txt",ios::out);
    char ch;
    char line[75];
    int i = 1;


    while(fin.get(ch)){
        fin.get(line,75,'.');
        fout<<"Line "<<i<<" : "<<line<<endl;
        i++;
	}

	else(
		fout.open("new1.txt",ios::out);
		char ch;
		char line[75];
		int i=1;

		while(fin.get(ch)){
        fin.get(line,75,'.');
        fout<<"Line "<<i<<" : "<<line<<endl;
        i++;
    }
    fin.close();
    cout<<"done"<<endl;

    return 0;
}
