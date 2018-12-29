package com.varun.tictactoe;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
Button b;
ImageButton b1,b2,b3,b4,b5,b6,b7,b8,b9;
Boolean a=false;
int [][] arr=new int[][]{{0,0,0},{0,0,0},{0,0,0}};
int count=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        b=(Button)findViewById(R.id.button);
        b1=(ImageButton)findViewById(R.id.imageButton);
        b2=(ImageButton)findViewById(R.id.imageButton2);
        b3=(ImageButton)findViewById(R.id.imageButton3);
        b4=(ImageButton)findViewById(R.id.imageButton4);
        b5=(ImageButton)findViewById(R.id.imageButton5);
        b6=(ImageButton)findViewById(R.id.imageButton6);
        b7=(ImageButton)findViewById(R.id.imageButton7);
        b8=(ImageButton)findViewById(R.id.imageButton8);
        b9=(ImageButton)findViewById(R.id.imageButton9);


        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (a == false)
                {
                    b1.setImageResource(R.drawable.doremon);
                    arr[0][0]=1;
                }
                else
                {
                    b1.setImageResource(R.drawable.shinchan);
                    arr[0][0]=2;
                }
                a=!a ;
                b1.setEnabled(false);
                count++;
                if(count>=5) win();
            }
        });

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (a == false)
                {
                    b2.setImageResource(R.drawable.doremon);
                    arr[0][1]=1;
                }
                else
                {
                    b2.setImageResource(R.drawable.shinchan);
                    arr[0][1]=2;
                }
                a=!a;
                b2.setEnabled(false);
                count++;
                if(count>=5) win();
            }
        });

        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (a == false)
                {
                    b3.setImageResource(R.drawable.doremon);
                    arr[0][2]=1;
                }
                else
                {
                    b3.setImageResource(R.drawable.shinchan);
                    arr[0][2]=2;
                }
                a=!a;
                b3.setEnabled(false);
            }
        });

        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (a == false)
                {
                    b4.setImageResource(R.drawable.doremon);
                    arr[1][0]=1;
                }
                else
                {
                    b4.setImageResource(R.drawable.shinchan);
                    arr[1][0]=2;
                }
                a=!a;
                b4.setEnabled(false);
                count++;
                if(count>=5) win();
            }
        });

        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (a == false)
                {
                    b5.setImageResource(R.drawable.doremon);
                    arr[1][1]=1;
                }
                else
                {
                    b5.setImageResource(R.drawable.shinchan);
                    arr[1][1]=2;
                }
                a=!a;
                b5.setEnabled(false);
                count++;
                if(count>=5) win();
            }
        });

        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (a == false)
                {
                    b6.setImageResource(R.drawable.doremon);
                    arr[1][2]=1;
                }
                else
                {
                    b6.setImageResource(R.drawable.shinchan);
                    arr[1][2]=2;
                }
                a=!a;
                b6.setEnabled(false);
                count++;
                if(count>=5) win();
            }
        });

        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (a == false)
                {
                    b7.setImageResource(R.drawable.doremon);
                    arr[2][0]=1;
                }
                else
                {
                    b7.setImageResource(R.drawable.shinchan);
                    arr[2][0]=2;
                }
                a=!a;
                b7.setEnabled(false);
                count++;
                if(count>=5) win();
            }
        });

        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (a == false)
                {
                    b8.setImageResource(R.drawable.doremon);
                    arr[2][1]=1;
                }
                else
                {
                    b8.setImageResource(R.drawable.shinchan);
                    arr[2][1]=2;
                }
                a=!a;
                b8.setEnabled(false);
                count++;
                if(count>=5) win();
            }
        });

        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (a == false)
                {
                    b9.setImageResource(R.drawable.doremon);
                    arr[2][2]=1;
                }
                else
                {
                    b9.setImageResource(R.drawable.shinchan);
                    arr[2][2]=2;
                }
                a=!a;
                b9.setEnabled(false);
                count++;
                if(count>=5) win();
            }
        });

        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               showall();
                b1.setEnabled(true);
                b2.setEnabled(true);
                b3.setEnabled(true);
                b4.setEnabled(true);
                b5.setEnabled(true);
                b6.setEnabled(true);
                b7.setEnabled(true);
                b8.setEnabled(true);
                b9.setEnabled(true);
                a=!a;
                arr=new int[][]{{0,0,0},{0,0,0},{0,0,0}};
                count =0;
            }
        });
    }

    private void showall()
    {
        b1.setImageResource(R.drawable.blank);
        b2.setImageResource(R.drawable.blank);
        b3.setImageResource(R.drawable.blank);
        b4.setImageResource(R.drawable.blank);
        b5.setImageResource(R.drawable.blank);
        b6.setImageResource(R.drawable.blank);
        b7.setImageResource(R.drawable.blank);
        b8.setImageResource(R.drawable.blank);
        b9.setImageResource(R.drawable.blank);
    }

    private void win()
    {
        if (arr[0][0]==1 && arr[0][1]==1 && arr[0][2]==1)
        {
            Toast.makeText(getApplicationContext(),"DOREMON WINS",Toast.LENGTH_SHORT).show();
        }

        else if (arr[0][0]==2 && arr[0][1]==2 && arr[0][2]==2)
        {
            Toast.makeText(getApplicationContext(),"SHINCHAN WINS",Toast.LENGTH_SHORT).show();
        }

        else if (arr[1][0]==1 && arr[1][1]==1 && arr[1][2]==1)
        {
            Toast.makeText(getApplicationContext(),"DOREMON WINS",Toast.LENGTH_SHORT).show();
        }

        else if (arr[1][0]==2 && arr[1][1]==2 && arr[1][2]==2)
        {
            Toast.makeText(getApplicationContext(),"SHINCHAN WINS",Toast.LENGTH_SHORT).show();
        }

        else if (arr[2][0]==1 && arr[2][1]==1 && arr[2][2]==1)
        {
            Toast.makeText(getApplicationContext(),"DOREMON WINS",Toast.LENGTH_SHORT).show();
        }

        else if (arr[2][0]==2 && arr[2][1]==2 && arr[2][2]==2)
        {
            Toast.makeText(getApplicationContext(),"SHINCHAN WINS",Toast.LENGTH_SHORT).show();
        }

        else if (arr[0][0]==1 && arr[1][0]==1 && arr[2][0]==1)
        {
            Toast.makeText(getApplicationContext(),"DOREMON WINS",Toast.LENGTH_SHORT).show();
        }

        else if (arr[0][0]==2 && arr[1][0]==2 && arr[2][0]==2)
        {
            Toast.makeText(getApplicationContext(),"SHINCHAN WINS",Toast.LENGTH_SHORT).show();
        }

        else if (arr[0][1]==1 && arr[1][1]==1 && arr[2][1]==1)
        {
            Toast.makeText(getApplicationContext(),"DOREMON WINS",Toast.LENGTH_SHORT).show();
        }

        else if (arr[0][1]==2 && arr[1][1]==2 && arr[2][1]==2)
        {
            Toast.makeText(getApplicationContext(),"SHINCHAN WINS",Toast.LENGTH_SHORT).show();
        }

        else if (arr[0][2]==1 && arr[1][2]==1 && arr[2][2]==1)
        {
            Toast.makeText(getApplicationContext(),"DOREMON WINS",Toast.LENGTH_SHORT).show();
        }

        else if (arr[0][2]==2 && arr[1][2]==2 && arr[2][2]==2)
        {
            Toast.makeText(getApplicationContext(),"SHINCHAN WINS",Toast.LENGTH_SHORT).show();
        }

        else if (arr[0][0]==1 && arr[1][1]==1 && arr[2][2]==1)
        {
            Toast.makeText(getApplicationContext(),"DOREMON WINS",Toast.LENGTH_SHORT).show();
        }

        else if (arr[0][0]==2 && arr[1][1]==2 && arr[2][2]==2)
        {
            Toast.makeText(getApplicationContext(),"SHINCHAN WINS",Toast.LENGTH_SHORT).show();
        }

        else if (arr[0][2]==1 && arr[1][1]==1 && arr[2][0]==1)
        {
            Toast.makeText(getApplicationContext(),"DOREMON WINS",Toast.LENGTH_SHORT).show();
        }

        else if (arr[0][2]==2 && arr[1][1]==2 && arr[2][0]==2)
        {
            Toast.makeText(getApplicationContext(),"SHINCHAN WINS",Toast.LENGTH_SHORT).show();
        }

    }
}
