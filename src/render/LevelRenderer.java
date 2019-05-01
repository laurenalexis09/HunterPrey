package render;

import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

import level.Level;
import utilities.StdDraw;

public class LevelRenderer{

	Level level;

	private HunterRenderer hunter = new HunterRenderer();
	private PreyRenderer prey = new PreyRenderer();
	private BiomeRenderer biomes = new BiomeRenderer();
	private PowerupRenderer powerups = new PowerupRenderer();
	private PortalRenderer portal = new PortalRenderer();

	public LevelRenderer(Level levelIn){
		try {
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		} catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException e) {
			System.out.println("No idea what to do if this throws, just crash I guess.");
			e.printStackTrace();
		}
		StdDraw.enableDoubleBuffering();
		this.level = levelIn;
	}
	
	public void setLevel(Level level) {
		this.level = level;
	}

	public void render() {
		StdDraw.clear();
		StdDraw.setPenColor(8, 146, 208);

		renderBiome();
		renderPowerups();
		renderPrey();
		renderHunters();
		if(level.portalSpawned)
			portal.render(level.nextLevelPortal);

		StdDraw.show();
	}
	
	private void renderBiome() {
		biomes.render(level.biome);
	}
	
	private void renderPowerups() {
		for (int i = 0; i < level.powerups.size(); i++){
			powerups.render(level.powerups.get(i));
		}
	}
	
	private void renderPrey() {
		for (int i = 0; i < level.prey.length; i++){
			prey.render(level.prey[i]);
		}
	}
	
	private void renderHunters() {
		if(level.isAtLeastOnePreyAlive()) {
			for(int i = 0; i < level.hunters.length; i++){
				hunter.rendeWithPreyAlive(level.hunters[i]);
			}
		}
	}

}
