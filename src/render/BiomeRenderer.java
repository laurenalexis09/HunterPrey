package render;

import java.awt.Color;

import biome.ArcticBiome;
import biome.Biome;
import biome.ForestBiome;
import biome.MarsBiome;
import biome.RandomBiome;
import utilities.StdDraw;
import level.LevelList;
import main.HunterPrey;

public class BiomeRenderer {

	//private CircleRenderer circles = new CircleRenderer();

	public void render(Biome biome) {
		StdDraw.setPenColor(biome.biomeColor);
		StdDraw.filledSquare(5, 5, 5);

		if(biome instanceof ForestBiome) {

			if(HunterPrey.currentLevel == 0) {

				StdDraw.setPenColor(StdDraw.BOOK_LIGHT_BLUE);
				StdDraw.filledRectangle(0.5, 0.9, 0.5, 0.1);
				for(double i = 0; i <= 1; i= i+0.1) {
					StdDraw.setPenColor(new Color(59,48,56));
					StdDraw.filledRectangle(i, 0.78, 0.04, 0.075);	
					StdDraw.setPenColor(new Color(0,82,33));
					StdDraw.filledCircle(i, 0.89, 0.08);

					StdDraw.setPenColor(new Color(80,61,53));
					StdDraw.filledRectangle(i-0.05, 0.48, 0.04, 0.075);	
					StdDraw.setPenColor(new Color(42,111,55));
					StdDraw.filledCircle(i-0.05, 0.59, 0.08);

					StdDraw.setPenColor(new Color(108,76,66));
					StdDraw.filledRectangle(i, 0.18, 0.04, 0.075);	
					StdDraw.setPenColor(new Color(81,137,82));
					StdDraw.filledCircle(i, 0.29, 0.08);
				}

			}

			if(HunterPrey.currentLevel == 1) {

				StdDraw.setPenColor(StdDraw.BOOK_LIGHT_BLUE);
				StdDraw.filledRectangle(0.5, 0.9, 0.5, 0.1);
				for(double i = 0; i <= 1; i= i+0.1) {
					StdDraw.setPenColor(new Color(59,48,56));
					StdDraw.filledRectangle(i, 0.78, 0.04, 0.075);	
					StdDraw.setPenColor(new Color(0,82,33));
					StdDraw.filledCircle(i, 0.89, 0.08);

					StdDraw.setPenColor(255,223,0);

					StdDraw.filledCircle(0.1, 0.87, 0.009);

					StdDraw.filledCircle(0.2, 0.84, 0.009);

					StdDraw.filledCircle(0.3, 0.91, 0.009);

					StdDraw.filledCircle(0.4, 0.83, 0.009);

					StdDraw.filledCircle(0.5, 0.87, 0.009);

					StdDraw.filledCircle(0.6, 0.94, 0.009);

					StdDraw.filledCircle(0.7, 0.87, 0.009);

					StdDraw.filledCircle(0.8, 0.84, 0.009);

					StdDraw.filledCircle(0.9, 0.95, 0.009);

					StdDraw.setPenColor(new Color(80,61,53));
					StdDraw.filledRectangle(i-0.05, 0.48, 0.04, 0.075);	
					StdDraw.setPenColor(new Color(42,111,55));
					StdDraw.filledCircle(i-0.05, 0.59, 0.08);

					StdDraw.setPenColor(249,129,42);

					StdDraw.filledCircle(0.1, 0.62, 0.009);

					StdDraw.filledCircle(0.2, 0.54, 0.009);

					StdDraw.filledCircle(0.3, 0.61, 0.009);

					StdDraw.filledCircle(0.4, 0.57, 0.009);

					StdDraw.filledCircle(0.5, 0.63, 0.009);

					StdDraw.filledCircle(0.6, 0.54, 0.009);

					StdDraw.filledCircle(0.7, 0.59, 0.009);

					StdDraw.filledCircle(0.8, 0.54, 0.009);

					StdDraw.filledCircle(0.9, 0.65, 0.009);

					StdDraw.setPenColor(new Color(108,76,66));
					StdDraw.filledRectangle(i, 0.18, 0.04, 0.075);	
					StdDraw.setPenColor(new Color(81,137,82));
					StdDraw.filledCircle(i, 0.29, 0.08);

					StdDraw.setPenColor(255,0,0);

					StdDraw.filledCircle(0.1, 0.22, 0.009);

					StdDraw.filledCircle(0.2, 0.24, 0.009);

					StdDraw.filledCircle(0.3, 0.31, 0.009);

					StdDraw.filledCircle(0.4, 0.27, 0.009);

					StdDraw.filledCircle(0.5, 0.24, 0.009);

					StdDraw.filledCircle(0.6, 0.34, 0.009);

					StdDraw.filledCircle(0.7, 0.29, 0.009);

					StdDraw.filledCircle(0.8, 0.24, 0.009);

					StdDraw.filledCircle(0.9, 0.35, 0.009);

				}

			}

			if(HunterPrey.currentLevel == 2) {

				StdDraw.setPenColor(97,117,89);
				StdDraw.filledSquare(0.5, 0.5, 0.5);
				StdDraw.setPenColor(StdDraw.BOOK_LIGHT_BLUE);
				StdDraw.filledRectangle(0.5, 0.9, 0.5, 0.1);
				for(double i = 0; i <= 1; i= i+0.1) {
					StdDraw.setPenColor(new Color(59,48,56));
					StdDraw.filledRectangle(i, 0.78, 0.04, 0.075); //Trunks	
					StdDraw.setPenColor(new Color(136,39,6));
					StdDraw.filledCircle(i, 0.89, 0.08); //Trees

					StdDraw.setPenColor(255,223,0);

					StdDraw.filledCircle(0.13, 0.69, 0.009);

					StdDraw.filledCircle(0.25, 0.70, 0.009);

					StdDraw.filledCircle(0.37, 0.68, 0.009);

					StdDraw.filledCircle(0.48, 0.70, 0.009);

					StdDraw.filledCircle(0.57, 0.69, 0.009);

					StdDraw.filledCircle(0.65, 0.70, 0.009);

					StdDraw.filledCircle(0.74, 0.69, 0.009);

					StdDraw.filledCircle(0.87, 0.68, 0.009);

					StdDraw.filledCircle(0.96, 0.69, 0.009);

					StdDraw.setPenColor(new Color(80,61,53));
					StdDraw.filledRectangle(i-0.05, 0.48, 0.04, 0.075);	
					StdDraw.setPenColor(new Color(212,91,18));
					StdDraw.filledCircle(i-0.05, 0.59, 0.08);

					StdDraw.setPenColor(249,129,42);

					StdDraw.filledCircle(0.09, 0.39, 0.009);

					StdDraw.filledCircle(0.17, 0.40, 0.009);

					StdDraw.filledCircle(0.23, 0.38, 0.009); //Apples

					StdDraw.filledCircle(0.35, 0.39, 0.009);

					StdDraw.filledCircle(0.42, 0.40, 0.009);

					StdDraw.filledCircle(0.57, 0.38, 0.009);

					StdDraw.filledCircle(0.64, 0.39, 0.009);

					StdDraw.filledCircle(0.71, 0.40, 0.009);

					StdDraw.filledCircle(0.83, 0.39, 0.009);

					StdDraw.filledCircle(0.95, 0.38, 0.009);

					StdDraw.setPenColor(new Color(108,76,66));
					StdDraw.filledRectangle(i, 0.18, 0.04, 0.075);	
					StdDraw.setPenColor(new Color(243,188,46));
					StdDraw.filledCircle(i, 0.29, 0.08);

					StdDraw.setPenColor(255,0,0);

					StdDraw.filledCircle(0.13, 0.09, 0.009);

					StdDraw.filledCircle(0.23, 0.06, 0.009);

					StdDraw.filledCircle(0.37, 0.08, 0.009);

					StdDraw.filledCircle(0.42, 0.07, 0.009);

					StdDraw.filledCircle(0.53, 0.09, 0.009);

					StdDraw.filledCircle(0.65, 0.08, 0.009);

					StdDraw.filledCircle(0.71, 0.1, 0.009);

					StdDraw.filledCircle(0.84, 0.07, 0.009);

					StdDraw.filledCircle(0.91, 0.06, 0.009);

				}

			}

		}

		if(biome instanceof MarsBiome) {

			if(HunterPrey.currentLevel == 3) {

				StdDraw.setPenColor(8,25,47); //Space
				StdDraw.filledSquare(0, 0, 5);

				StdDraw.setPenColor(new Color(255,255,255));
				StdDraw.setPenRadius(0.004);
				StdDraw.point(.97, .34); //Stars
				StdDraw.point(.95, .90);
				StdDraw.point(.90, .64);
				StdDraw.point(.83, .71);
				StdDraw.point(.83, .71);
				StdDraw.point(.78, .87);
				StdDraw.point(.71, .53);
				StdDraw.point(.69, .95);
				StdDraw.point(.57, .90);
				StdDraw.point(.48, .78);
				StdDraw.point(.36, .79);
				StdDraw.point(.25, .81);
				StdDraw.point(.12, .95);
				StdDraw.point(.08, .92);

				StdDraw.setPenColor(184, 15, 10);
				StdDraw.filledCircle(0.25, 0, 0.75); //Mars
				StdDraw.setPenColor(137,0,0);
				StdDraw.filledEllipse(0.46,0.67, 0.025, 0.015); //Craters
				StdDraw.filledEllipse(0.10,0.60, 0.03, 0.02);
				StdDraw.filledEllipse(0.60,0.42, 0.04, 0.03);
				StdDraw.filledEllipse(0.3,0.13, 0.15, 0.1);
				StdDraw.setPenColor(80,0,0);
				StdDraw.filledEllipse(0.46,0.666, 0.015, 0.01);
				StdDraw.filledEllipse(0.10, 0.59, 0.02, 0.01);
				StdDraw.filledEllipse(0.60, 0.41, 0.03, 0.02);
				StdDraw.filledEllipse(0.3, 0.10, 0.12, 0.07);
				StdDraw.setPenRadius();
			}

			if(HunterPrey.currentLevel == 4) {

				StdDraw.setPenColor(8,25,47);
				StdDraw.filledSquare(0, 0, 5);

				StdDraw.setPenColor(new Color(255,255,255));
				StdDraw.setPenRadius(0.004);
				StdDraw.point(.97, .34);
				StdDraw.point(.95, .90);
				StdDraw.point(.90, .64);
				StdDraw.point(.83, .71);
				StdDraw.point(.83, .71);
				StdDraw.point(.78, .87);
				StdDraw.point(.71, .53);
				StdDraw.point(.69, .95);
				StdDraw.point(.57, .90);
				StdDraw.point(.48, .78);
				StdDraw.point(.36, .79);
				StdDraw.point(.25, .81);
				StdDraw.point(.12, .95);
				StdDraw.point(.08, .92);

				StdDraw.setPenColor(66, 13, 9);
				StdDraw.filledCircle(0.80, 0.75, 0.15);
				StdDraw.setPenColor(92, 25, 20);
				StdDraw.filledCircle(0.795, 0.755, 0.145);

				StdDraw.setPenColor(184, 15, 10);
				StdDraw.filledCircle(0.25, 0, 0.75);
				StdDraw.setPenColor(137,0,0);
				StdDraw.filledEllipse(0.46,0.67, 0.025, 0.015);
				StdDraw.filledEllipse(0.10,0.60, 0.03, 0.02);
				StdDraw.filledEllipse(0.60,0.42, 0.04, 0.03);
				StdDraw.filledEllipse(0.3,0.13, 0.15, 0.1);
				StdDraw.setPenColor(80,0,0);
				StdDraw.filledEllipse(0.46,0.666, 0.015, 0.01);
				StdDraw.filledEllipse(0.10, 0.59, 0.02, 0.01);
				StdDraw.filledEllipse(0.60, 0.41, 0.03, 0.02);
				StdDraw.filledEllipse(0.3, 0.10, 0.12, 0.07);
				StdDraw.setPenRadius();
			}
			

			if(HunterPrey.currentLevel == 5) {

				StdDraw.setPenColor(8,25,47);
				StdDraw.filledSquare(0, 0, 5);

				StdDraw.setPenColor(249,215,28);
				StdDraw.filledCircle(0, 1, 0.25);

				StdDraw.setPenColor(new Color(255,255,255));
				StdDraw.setPenRadius(0.004);
				StdDraw.point(.97, .34);
				StdDraw.point(.95, .90);
				StdDraw.point(.90, .64);
				StdDraw.point(.83, .71);
				StdDraw.point(.83, .71);
				StdDraw.point(.78, .87);
				StdDraw.point(.71, .53);
				StdDraw.point(.69, .95);
				StdDraw.point(.57, .90);
				StdDraw.point(.48, .78);
				StdDraw.point(.36, .79);
				StdDraw.point(.25, .81);

				StdDraw.setPenColor(66, 13, 9);
				StdDraw.filledCircle(0.80, 0.75, 0.15);
				StdDraw.setPenColor(92, 25, 20);
				StdDraw.filledCircle(0.795, 0.755, 0.145);

				StdDraw.setPenColor(66, 13, 9);
				StdDraw.filledCircle(0.50, 0.80, 0.05);
				StdDraw.setPenColor(92, 25, 20);
				StdDraw.filledCircle(0.495, 0.805, 0.045);

				StdDraw.setPenColor(184, 15, 10);
				StdDraw.filledCircle(0.25, 0, 0.75);
				StdDraw.setPenColor(137,0,0);

				StdDraw.filledEllipse(0.10, 0.65, 0.03, 0.02);
				StdDraw.filledEllipse(0.60, 0.52, 0.04, 0.03);
				StdDraw.filledEllipse(0.3, 0.30, 0.15, 0.1);
				StdDraw.filledEllipse(0.7, 0.07, 0.17, 0.11);
				StdDraw.setPenColor(80,0,0);

				StdDraw.filledEllipse(0.10, 0.64, 0.02, 0.01);
				StdDraw.filledEllipse(0.60, 0.51, 0.03, 0.02);
				StdDraw.filledEllipse(0.3, 0.27, 0.12, 0.07);
				StdDraw.filledEllipse(0.7, 0.04, 0.15, 0.09);
				StdDraw.setPenRadius();
			}
		}

		if(biome instanceof ArcticBiome) {
			if(HunterPrey.currentLevel == 6) {
				StdDraw.setPenColor(0,130,255);
				StdDraw.filledSquare(0.5, 0.5, 1);
				StdDraw.setPenColor(StdDraw.YELLOW);
				StdDraw.filledCircle(0.40, 0.85, 0.1);
				StdDraw.setPenColor(StdDraw.BOOK_BLUE);
				StdDraw.filledRectangle(0.5, 0.6, 0.5, 0.1);
				StdDraw.setPenColor(190,190,190);
				StdDraw.filledRectangle(0.5, 0.7, 0.06, 0.125);
				StdDraw.filledRectangle(0.4, 0.68, 0.06, 0.125);
				StdDraw.filledRectangle(0.3, 0.62, 0.06, 0.125);
				StdDraw.filledRectangle(0.2, 0.56, 0.06, 0.125);
				StdDraw.filledRectangle(0.6, 0.66, 0.06, 0.125);
				StdDraw.filledRectangle(0.7, 0.64, 0.06, 0.125);
				StdDraw.filledRectangle(0.8, 0.56, 0.06, 0.125);
				StdDraw.setPenColor(240,240,255);
				StdDraw.filledRectangle(0.50, 0.40, 0.5, 0.20);
				StdDraw.setPenColor(200,200,200);
				StdDraw.filledRectangle(0.50, 0.20, 0.5, 0.05);
				StdDraw.setPenColor(190,190,190);
				for(double h = 0; h <= 1; h+=0.02) {
					StdDraw.line(h, 0.15, h, 0.25);
				}

				
				StdDraw.setPenColor(0,0, 240);
				for(double t = 0.1; t < 0.25; t=t+0.04) {
					StdDraw.arc(t, 0.07, 0.02, 180, 0);
				}

				for(double t = 0.02; t < 0.21; t=t+0.04) {
					StdDraw.arc(t, 0.13, 0.02, 180, 0);
				}
				for(double t = 0.59; t < 0.70; t=t+0.04) {
					StdDraw.arc(t, 0.08, 0.02, 180, 0);
				}

				for(double t = 0.85; t < 0.99; t=t+0.04) {
					StdDraw.arc(t, 0.09, 0.02, 180, 0);
				}
			}

			if(HunterPrey.currentLevel == 7) {
				StdDraw.setPenColor(0,130,255);
				StdDraw.filledSquare(0.5, 0.5, 1);
				StdDraw.setPenColor(StdDraw.YELLOW);
				StdDraw.filledCircle(0.40, 0.85, 0.1);
				
				StdDraw.setPenColor(StdDraw.WHITE);
				StdDraw.filledCircle(0.66, 0.80, 0.07);
				StdDraw.filledCircle(0.70, 0.83, 0.07);
				StdDraw.filledCircle(0.63, 0.81, 0.07);
				StdDraw.filledCircle(0.70, 0.88, 0.07);
				StdDraw.filledCircle(0.68, 0.90, 0.07);
				StdDraw.filledCircle(0.74, 0.81, 0.07);
				
				StdDraw.setPenColor(StdDraw.BOOK_BLUE);
				StdDraw.filledRectangle(0.5, 0.6, 0.5, 0.1);
				StdDraw.setPenColor(190,190,190);
				StdDraw.filledRectangle(0.5, 0.7, 0.06, 0.125);
				StdDraw.filledRectangle(0.4, 0.68, 0.06, 0.125);
				StdDraw.filledRectangle(0.3, 0.62, 0.06, 0.125);
				StdDraw.filledRectangle(0.2, 0.56, 0.06, 0.125);
				StdDraw.filledRectangle(0.6, 0.66, 0.06, 0.125);
				StdDraw.filledRectangle(0.7, 0.64, 0.06, 0.125);
				StdDraw.filledRectangle(0.8, 0.56, 0.06, 0.125);
				StdDraw.setPenColor(240,240,255);
				StdDraw.filledRectangle(0.50, 0.40, 0.5, 0.20);
				StdDraw.setPenColor(200,200,200);
				StdDraw.filledRectangle(0.50, 0.20, 0.5, 0.05);
				StdDraw.setPenColor(190,190,190);
				for(double h = 0; h <= 1; h+=0.02) {
					StdDraw.line(h, 0.15, h, 0.25);
				}
				StdDraw.setPenRadius(0.008);
				StdDraw.line(0.4, 0.4, 0.5, 0.5);
				StdDraw.line(0.45, 0.45, 0.1, 0.3);
				StdDraw.line(0.35, 0.35, 0.05, 0.4);
				
				StdDraw.line(0.6, 0.40, 0.93, 0.33);
				StdDraw.line(0.7, 0.32, 0.8, 0.43);
				StdDraw.line(0.6, 0.36, 0.9, 0.48);
				StdDraw.setPenRadius();

				
				StdDraw.setPenColor(0,0, 240);
				for(double t = 0.1; t < 0.25; t=t+0.04) {
					StdDraw.arc(t, 0.07, 0.02, 180, 0);
				}

				for(double t = 0.02; t < 0.21; t=t+0.04) {
					StdDraw.arc(t, 0.13, 0.02, 180, 0);
				}
				for(double t = 0.59; t < 0.70; t=t+0.04) {
					StdDraw.arc(t, 0.08, 0.02, 180, 0);
				}

				for(double t = 0.85; t < 0.99; t=t+0.04) {
					StdDraw.arc(t, 0.09, 0.02, 180, 0);
				}
			}

			if(HunterPrey.currentLevel == 8) {
				StdDraw.setPenColor(0,130,255);
				StdDraw.filledSquare(0.5, 0.5, 1);
				StdDraw.setPenColor(StdDraw.YELLOW);
				StdDraw.filledCircle(0.40, 0.85, 0.1);
				
				StdDraw.setPenColor(StdDraw.WHITE);
				StdDraw.filledCircle(0.66, 0.80, 0.07);
				StdDraw.filledCircle(0.70, 0.83, 0.07);
				StdDraw.filledCircle(0.63, 0.81, 0.07);
				StdDraw.filledCircle(0.70, 0.88, 0.07);
				StdDraw.filledCircle(0.68, 0.90, 0.07);
				StdDraw.filledCircle(0.74, 0.81, 0.07);
				
				StdDraw.setPenColor(StdDraw.BOOK_BLUE);
				StdDraw.filledRectangle(0.5, 0.6, 0.5, 0.1);
				StdDraw.setPenColor(190,190,190);
				StdDraw.filledRectangle(0.5, 0.7, 0.06, 0.125);
				StdDraw.filledRectangle(0.4, 0.68, 0.06, 0.125);
				StdDraw.filledRectangle(0.3, 0.62, 0.06, 0.125);
				StdDraw.filledRectangle(0.2, 0.56, 0.06, 0.125);
				StdDraw.filledRectangle(0.6, 0.66, 0.06, 0.125);
				StdDraw.filledRectangle(0.7, 0.64, 0.06, 0.125);
				StdDraw.filledRectangle(0.8, 0.56, 0.06, 0.125);
				StdDraw.setPenColor(240,240,255);
				StdDraw.filledRectangle(0.50, 0.40, 0.5, 0.20);
				StdDraw.setPenColor(200,200,200);
				StdDraw.filledRectangle(0.50, 0.20, 0.5, 0.05);
				StdDraw.setPenColor(190,190,190);
				for(double h = 0; h <= 1; h+=0.02) {
					StdDraw.line(h, 0.15, h, 0.25);
				}
				StdDraw.setPenRadius(0.008);
				StdDraw.line(0.4, 0.4, 0.5, 0.5);
				StdDraw.line(0.45, 0.45, 0.1, 0.3);
				StdDraw.line(0.35, 0.35, 0.05, 0.4);
				
				StdDraw.line(0.6, 0.40, 0.93, 0.33);
				StdDraw.line(0.7, 0.32, 0.8, 0.43);
				StdDraw.line(0.6, 0.36, 0.9, 0.48);
				StdDraw.setPenRadius();
				
				StdDraw.setPenColor(170,170,170);
				StdDraw.filledEllipse(0.7, 0.395, 0.08, 0.04);
				StdDraw.setPenColor(140,140,140);
				StdDraw.filledEllipse(0.7, 0.390, 0.07, 0.03);
				StdDraw.setPenColor(0,40,255);
				StdDraw.filledEllipse(0.7, 0.380, 0.05, 0.02);
				
				StdDraw.setPenColor(170,170,170);
				StdDraw.filledEllipse(0.25, 0.365, 0.07, 0.03);
				StdDraw.setPenColor(140,140,140);
				StdDraw.filledEllipse(0.25, 0.360, 0.06, 0.02);
				StdDraw.setPenColor(0,40,255);
				StdDraw.filledEllipse(0.25, 0.350, 0.03, 0.01);
				
				StdDraw.setPenColor(0,0, 240);
				for(double t = 0.1; t < 0.25; t=t+0.04) {
					StdDraw.arc(t, 0.07, 0.02, 180, 0);
				}

				for(double t = 0.02; t < 0.21; t=t+0.04) {
					StdDraw.arc(t, 0.13, 0.02, 180, 0);
				}
				for(double t = 0.59; t < 0.70; t=t+0.04) {
					StdDraw.arc(t, 0.08, 0.02, 180, 0);
				}

				for(double t = 0.85; t < 0.99; t=t+0.04) {
					StdDraw.arc(t, 0.09, 0.02, 180, 0);
				}
			}
		}

		if(biome instanceof RandomBiome) {

		}

		//		for (int i = 0; i < biome.circles.length; i++){
		//			circles.render(biome.circles[i]);
		//		}

	}
}
