package de.csbdresden.stardist;

import java.util.LinkedHashMap;
import java.util.Map;

public class Opt {
    
    static final String INPUT_IMAGE = "Input Image";
    static final String PROB_IMAGE = "Probability/Score Image";
    static final String DIST_IMAGE = "Distance Image";
    static final String LABEL_IMAGE = "Label Image";
    
    static final String MODEL = "Model";
    static final String MODEL_FILE = "Model (.zip) from File";
    static final String MODEL_URL = "Model (.zip) from URL";
    
    static final String NORMALIZE_IMAGE = "Normalize Image";
    static final String PERCENTILE_LOW = "Percentile low";
    static final String PERCENTILE_HIGH = "Percentile high";
    
    static final String PROB_THRESH = "Probability/Score Threshold";
    static final String NMS_THRESH = "Overlap Threshold";
    
    static final String OUTPUT_TYPE = "Output Type";
    static final String OUTPUT_ROI_MANAGER = "ROI Manager";
    static final String OUTPUT_LABEL_IMAGE = "Label Image";
    static final String OUTPUT_BOTH = "Both";    
    static final String OUTPUT_POLYGONS = "Polygons";
    
    static final String NUM_TILES = "Number of Tiles";
    static final String EXCLUDE_BNDRY = "Boundary Exclusion";
    static final String ROI_POSITION = "ROI Position";
    static final String ROI_POSITION_AUTO = "Automatic";
    static final String ROI_POSITION_STACK = "Stack";
    static final String ROI_POSITION_HYPERSTACK = "Hyperstack";
    static final String VERBOSE = "Verbose";
    static final String CSBDEEP_PROGRESS_WINDOW = "Show CNN Progress";
    static final String SHOW_PROB_DIST = "Show CNN Output";
    static final String SET_THRESHOLDS = "Set optimized postprocessing thresholds (for selected model)";    
    static final String RESTORE_DEFAULTS = "Restore Defaults";
    
    // TODO: add descriptions for all options
    
    private static final Map<String, Object> DEFAULTS = new LinkedHashMap<String, Object>();
    static {
        DEFAULTS.put(MODEL, StarDist2DModel.MODEL_DEFAULT);
        DEFAULTS.put(NORMALIZE_IMAGE, true);
        DEFAULTS.put(PERCENTILE_LOW, 1.0);
        DEFAULTS.put(PERCENTILE_HIGH, 99.8);
        DEFAULTS.put(PROB_THRESH, 0.5);
        DEFAULTS.put(NMS_THRESH, 0.4);
        DEFAULTS.put(OUTPUT_TYPE, OUTPUT_BOTH);
        DEFAULTS.put(NUM_TILES, 1);
        DEFAULTS.put(EXCLUDE_BNDRY, 2);
        DEFAULTS.put(ROI_POSITION, ROI_POSITION_AUTO);
        DEFAULTS.put(VERBOSE, false);
        DEFAULTS.put(CSBDEEP_PROGRESS_WINDOW, false);
        DEFAULTS.put(SHOW_PROB_DIST, false);
    }
    
    static Object getDefault(final String key) {
        return DEFAULTS.get(key);
    }
    
    private Opt() {}

}
