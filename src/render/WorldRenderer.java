package render;

import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

import utilities.StdDraw;
import world.World;

public class WorldRenderer {

	World world;

	private HunterRenderer hunter = new HunterRenderer();
	private PreyRenderer prey = new PreyRenderer();
	private BiomeRenderer biomes = new BiomeRenderer();

	public WorldRenderer(World worldIn){
		try {
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		} catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException e) {
			System.out.println("No idea what to do if this throws, just crash I guess.");
			e.printStackTrace();
		}
		StdDraw.enableDoubleBuffering();
		this.world = worldIn;
	}

	public void render() {
		StdDraw.clear();
		StdDraw.setPenColor(8, 146, 208);

		renderBiome();
		renderPrey();
		renderHunters();

		StdDraw.show();
		StdDraw.pause(40);
	}
	
	private void renderBiome() {
		biomes.render(world.biome);
	}
	
	private void renderPrey() {
		for (int i = 0; i < world.prey.length; i++){
			prey.render(world.prey[i]);
		}
	}
	
	private void renderHunters() {
		if(world.isAtLeastOnePreyAlive()) {
			for(int i = 0; i < world.hunters.length; i++){
				hunter.rendeWithPreyAlive(world.hunters[i]);
			}
		}
		else {
			for(int i = 0; i < world.hunters.length; i++){
				hunter.renderWithNoPreyAlive(world.hunters[i]);
			}
		}
	}

}
