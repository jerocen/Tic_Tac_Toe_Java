package com.example.tic_tac_toe_java;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.sql.Array;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity
{

    private final List<int[]> combinationsList = new ArrayList<>();
    private int [] boxPositions = {0,0,0,0,0,0,0,0,0};

    private int  playerTurn = 1;
    private int totalSelectedBoxes = 1;
    private LinearLayout playerOneLayout, playerTwoLayout;
    private TextView playerOneName, playerTwoName;
    private View image1, image2, image3, image4, image5, image6, image7, image8, image9;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final TextView playerOneName = findViewById(R.id.playerOneName);
        final TextView playerOneTwo = findViewById(R.id.playerTwoName);

        final LinearLayout playerOneLayout = findViewById(R.id.playerOneLayout);
        final LinearLayout playerTwoLayout = findViewById(R.id.playerTwoLayout);

        final View image1 = findViewById(R.id.image1);
        final View image2 = findViewById(R.id.image2);
        final View image3 = findViewById(R.id.image3);
        final View image4 = findViewById(R.id.image4);
        final View image5 = findViewById(R.id.image5);
        final View image6 = findViewById(R.id.image6);
        final View image7 = findViewById(R.id.image7);
        final View image8 = findViewById(R.id.image8);
        final View image9 = findViewById(R.id.image9);

        combinationsList.add(new int[]{0,1,2});
        combinationsList.add(new int[]{3,4,5});
        combinationsList.add(new int[]{6,7,8});
        combinationsList.add(new int[]{0,3,6});
        combinationsList.add(new int[]{1,4,7});
        combinationsList.add(new int[]{2,5,8});
        combinationsList.add(new int[]{2,4,6});
        combinationsList.add(new int[]{0,4,8});

        final String getPlayerOneName = getIntent().getStringExtra("playerOne");
        final String getPlayerTwoName = getIntent().getStringExtra("playerTwo");

        playerOneName.setText(getPlayerOneName);
        playerTwoName.setText(getPlayerTwoName);

        image1.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                if(isBoxSelectable(0))
                {

                }
            }
        });

        image2.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                if(isBoxSelectable(1))
                {

                }
            }
        });

        image3.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                if(isBoxSelectable(2))
                {

                }
            }
        });

        image4.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                if(isBoxSelectable(3))
                {

                }
            }
        });

        image5.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                if(isBoxSelectable(4))
                {

                }
            }
        });

        image6.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                if(isBoxSelectable(5))
                {

                }
            }
        });

        image7.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                if(isBoxSelectable(6))
                {

                }
            }
        });

        image8.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                if(isBoxSelectable(7))
                {

                }
            }
        });

        image9.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                if(isBoxSelectable(8))
                {

                }
            }
        });


    }
    private boolean isBoxSelectable(int boxPosition)
    {
        boolean response = false;

        if(boxPositions[boxPosition] == 0)
        {
            response = true;
        }

        return response;
    }
}